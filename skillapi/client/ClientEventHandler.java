package skillapi.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class ClientEventHandler {
	private Minecraft game = Minecraft.getMinecraft();
	private HudSkills skillsHUD = new HudSkills(game);

	@SubscribeEvent
	public void renderHUD(RenderGameOverlayEvent.Post event) {
		if (event.type == ElementType.AIR) {
			skillsHUD.drawHUD(event.resolution.getScaledWidth(), event.resolution.getScaledHeight(), event.partialTicks);
			game.renderEngine.bindTexture(Gui.icons);
		}
	}
}
