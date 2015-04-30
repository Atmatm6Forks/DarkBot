package org.darkstorm.minecraft.darkbot.protocol;

import java.util.Collection;

public interface StateModel {
	public String getName();
	public ProtocolModel getProtocol();
	public Collection<PacketModel> getPackets(Direction direction);
	public PacketModel getPacket(Direction direction, String name);
	public PacketModel getPacket(Direction direction, int id);
}