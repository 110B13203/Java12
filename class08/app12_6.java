package class08;  // �Napp12_6���O�ǤJpackage class08��
import class08.subpack1.CCircle;   // ���Jclass08.subpack1�̪�CCircle���O
import class08.subpack2.CRectangle;   // ���Jclass08.subpack2�̪�CRectangle���O
import class08.subpack1.subsubpack.CStyle;// ���Jclass08.subpack1.subsubpack�̪�CStyle���O
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
