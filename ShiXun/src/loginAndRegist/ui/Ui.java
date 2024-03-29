package loginAndRegist.ui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * 窗口界面优化
 * @author 陌生人
 *
 */
public class Ui {

	public Ui() { 
		super();
	}
	//设置窗口图标
	public static void setFrameImage(JFrame jf, String imageName) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image i = tk.getImage("src\\loginAndRegist\\image\\"+imageName);
		jf.setIconImage(i);
	}
	
	//设置图片界面返回一个面板
	public static JPanel setLoginAndRegistUI(JFrame jf) {
		Icon i = new ImageIcon("src\\loginAndRegist\\image\\img1.jpg");
		JLabel jl = new JLabel(i);
		JPanel jp = new JPanel();
		jl.setBounds(0, 0, Global.WIDTH, Global.HEIGHT);
		jp.setBounds(0, -5, Global.WIDTH, Global.HEIGHT);
		jp.add(jl);
		jf.add(jp);
		jp.add(jl);
		return jp;
	}
	
	//居中
	public static void setFrameCenter(JFrame jf) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		double srceenWidth = d.getWidth();
		double srceenHight = d.getHeight();
		int frameWidth = jf.getWidth();
		int frameHeight = jf.getHeight();
		int width = (int)(srceenWidth - frameWidth)/2;
		int height = (int)(srceenHight - frameHeight)/2;
		jf.setLocation(width, height);
	}
}
