package JinRyuu.DragonBC.common.p;

import JinRyuu.DragonBC.common.DBC;
import JinRyuu.DragonBC.common.DBCClient;
import JinRyuu.JRMCore.p.BAmh;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class DBCPascendsound implements IMessage {
   int i;

   public DBCPascendsound() {
   }

   public DBCPascendsound(int var1) {
      this.i = var1;
   }

   public void toBytes(ByteBuf var1) {
      var1.writeInt(this.i);
   }

   public void fromBytes(ByteBuf var1) {
      this.i = var1.readInt();
   }

   public static class Handler extends BAmh<DBCPascendsound> {
      public Handler() {
      }

      public IMessage handleClientMessage(EntityPlayer var1, DBCPascendsound var2, MessageContext var3) {
         DBCClient.phc.handleDBCascendsound(var2.i, var1);
         return null;
      }

      public IMessage handleServerMessage(EntityPlayer var1, DBCPascendsound var2, MessageContext var3) {
         DBC.phs.handleDBCascendsound(var2.i, var1);
         return null;
      }
   }
}
