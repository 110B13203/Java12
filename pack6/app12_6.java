// app12_6.java,���ɮ׸m��pack6��Ƨ���
package pack6;  // �Napp12_6���O�ǤJpackage pack6��
import pack6.subpack1.CCircle;   // ���Jpack6.subpack1�̪�CCircle���O
import pack6.subpack2.CRectangle;   // ���Jpack6.subpack2�̪�CRectangle���O
import pack6.subpack1.subsubpack.CStyle;// ���Jpack6.subpack1.subsubpack�̪�CStyle���O
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
