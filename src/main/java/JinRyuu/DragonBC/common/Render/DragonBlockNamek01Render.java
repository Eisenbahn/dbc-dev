package JinRyuu.DragonBC.common.Render;

import JinRyuu.DragonBC.common.Render.DragonBlock01Model;
import JinRyuu.DragonBC.common.Render.DragonBlockNamek01TileEntity;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DragonBlockNamek01Render extends TileEntitySpecialRenderer {
   private DragonBlock01Model aModel = new DragonBlock01Model();

   public DragonBlockNamek01Render() {
   }

   public void renderAModelAt(DragonBlockNamek01TileEntity var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 3.01F, (float)var6 + 0.5F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      ResourceLocation var9 = new ResourceLocation("jinryuudragonbc:DragonBlock.png");
      this.bindTexture(var9);
      GL11.glEnable(2977);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      this.aModel.renderModel(0.0625F);
      GL11.glPopMatrix();
      GL11.glDisable(3042);
      GL11.glPopMatrix();
   }

   public void renderTileEntityAt(TileEntity var1, double var2, double var4, double var6, float var8) {
      this.renderAModelAt((DragonBlockNamek01TileEntity)var1, var2, var4, var6, var8);
   }
}
