package class08;  // 將app12_6類別納入package class08當中
import class08.subpack1.CCircle;   // 載入class08.subpack1裡的CCircle類別
import class08.subpack2.CRectangle;   // 載入class08.subpack2裡的CRectangle類別
import class08.subpack1.subsubpack.CStyle;// 載入class08.subpack1.subsubpack裡的CStyle類別
public class app12_6
{
   public static void main(String args[])
   {
      CCircle cir=new CCircle();
      CRectangle rect=new CRectangle();
      CStyle sty=new CStyle(1);
      cir.show();
      rect.show();
   }
}
