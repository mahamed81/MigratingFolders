package Restaurant;

public class RoomService {
	
	
	private Kitchen kitchen;

	public RoomService(Kitchen reci) {
		this.kitchen = reci;
	}
	
	
	public String takeOrder(String  recip) {
		return kitchen.cook(recip);
	}
	
	
	
	
}
