/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import beans.DanhMucBean;
import com.dua1noficel.ui.HaoDonjframe;
import com.dua1noficel.ui.KhachHangjframe;
import com.dua1noficel.ui.NhanVienjrame;
import com.dua1noficel.ui.SanPhamjrame;
import com.dua1noficel.ui.ThongKejframe;
import com.dua1noficel.ui.TrangChujframe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class ChuyenManHinhControler {

    private JPanel root;
    private String kindSelect = "";

    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhControler(JPanel jpnroot) {
        this.root = jpnroot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelect = "TrangChu";

        jpnItem.setBackground(new Color(204,204,204));
        jlbItem.setBackground(new Color(204,204,204));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChujframe());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;

        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChujframe();
                    break;
                case "SanPham":
                    node = new SanPhamjrame();
                    break;
                case "NhanVien":
                    node = new NhanVienjrame();
                    break;
                case "KhachHang":
                    node = new KhachHangjframe();
                    break;
                case "HoaDon":
                    node = new HaoDonjframe();
                    break;
                case "ThongKe":
                    node = new ThongKejframe();
                    break;
                default:
                    node = new TrangChujframe();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);

        }

        @Override
        public void mousePressed(MouseEvent e) {//khi click vào menu thì sẽ có hiệu ứng nháy màu chọn
            kindSelect = kind;
            jpnItem.setBackground(new Color(153,153,153));
            jlbItem.setBackground(new Color(153,153,153));
        }

        public void mouseEntered(MouseEvent e) {// khi rê vào menu thì sẽ đổi màu
            jpnItem.setBackground(new Color(204,204,204));
            jlbItem.setBackground(new Color(204,204,204));
        }

        @Override
        public void mouseExited(MouseEvent e) { //khi thoát rê chuột ở menu
            if (!kindSelect.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(204,204,204));
                jlbItem.setBackground(new Color(204,204,204));

            }
        }
         private void setChangeBackground(String kind) {
            for (DanhMucBean item : listItem) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                     item.getJlb().setBackground(new Color(204,204,204));
                     item.getJpn().setBackground(new Color(204,204,204));
                } else {
                       item.getJlb().setBackground(new Color(204,204,204));
                     item.getJpn().setBackground(new Color(204,204,204));
                  
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
          
        }
    }
}
