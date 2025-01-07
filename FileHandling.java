package ProjectLab;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class FileHandling {
	public abstract void gallerySection () throws FileNotFoundException;
	public abstract void seatRow() throws FileNotFoundException;
	public abstract void DownloadTicket(Payment buyer,String side, String row, String match, String stadium, int amount, String id) throws IOException;
	public abstract void showMatches() throws FileNotFoundException;
}
