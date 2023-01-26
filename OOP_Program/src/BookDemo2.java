import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Input author name: ");
	String email = JOptionPane.showInputDialog("Input author e-mail: ");
	String title = JOptionPane.showInputDialog("Input book title: ");
	int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
	Book1 book = new Book1(title,new Author1(name,email),page);
	int check = JOptionPane.showConfirmDialog(null, "Is the page correct?", "Confirm", JOptionPane.YES_NO_OPTION);
	if(check == 1) {
	book.setPage(Integer.parseInt(JOptionPane.showInputDialog("Input book page, again: ")));
	book.setPage(page);
	}else if (check == 0){
	book.setPage(page);
	JOptionPane.showMessageDialog(null,"Book Title : "+book.getTitle()+
    "\nAuthor name : "+book.getAuthor().getName()+" ("+book.getPage()+" page)"+
    "\nAuthor e-mail : "+book.getAuthor().getEmail());	
		}
	}
}
