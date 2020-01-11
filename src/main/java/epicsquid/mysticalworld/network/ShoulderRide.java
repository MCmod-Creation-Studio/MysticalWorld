package epicsquid.mysticalworld.network;


import epicsquid.mysticalworld.capability.PlayerShoulderCapability;
import epicsquid.mysticalworld.capability.PlayerShoulderCapabilityProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.UUID;
import java.util.function.Supplier;

public class ShoulderRide {
  private CompoundNBT tag;
  private UUID id;

  public ShoulderRide(PacketBuffer buffer) {
    long uuid1 = buffer.readLong();
    long uuid2 = buffer.readLong();
    id = new UUID(uuid1, uuid2);
    tag = buffer.readCompoundTag();
  }

  public ShoulderRide(PlayerEntity player, PlayerShoulderCapability cap) {
    this.tag = cap.writeNBT();
    this.id = player.getUniqueID();
  }

  public CompoundNBT getTag() {
    return tag;
  }

  public UUID getId() {
    return id;
  }

  public void encode(PacketBuffer buf) {
    buf.writeLong(id.getMostSignificantBits());
    buf.writeLong(id.getLeastSignificantBits());
    buf.writeCompoundTag(tag);
  }

  public void handle(Supplier<NetworkEvent.Context> context) {
    context.get().enqueueWork(() -> handle(this, context));
  }

  @OnlyIn(Dist.CLIENT)
  private static void handle(ShoulderRide message, Supplier<NetworkEvent.Context> context) {
    PlayerEntity target = Minecraft.getInstance().player;
    World world = target.world;
    if (!target.getUniqueID().equals(message.getId())) {
      target = world.getPlayerByUuid(message.getId());
    }

    if (target == null) {
      return;
    }

    target.getCapability(PlayerShoulderCapabilityProvider.PLAYER_SHOULDER_CAPABILITY).ifPresent((cap) -> {
      cap.readNBT(message.getTag());
    });
  }
}
