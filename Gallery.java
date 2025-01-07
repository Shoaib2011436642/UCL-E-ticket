package ProjectLab;

public class Gallery {
	
		
	//Match 1 North
		private int ticketLeft_Match1_NorthFront = 60;
		private int ticketBought_Match1_NorthFront;
		
		private int ticketLeft_Match1_NorthMiddle = 40;
		private int ticketBought_Match1_NorthMiddle;
		
		private int ticketLeft_Match1_NorthBack=54;
		private int ticketBought_Match1_NorthBack;
		
		//Match 1 South
		private int ticketLeft_Match1_SouthFront=43;
		private int ticketBought_Match1_SouthFront;
		
		private int ticketLeft_Match1_SouthMiddle=34;
		private int ticketBought_Match1_SouthMiddle;
		
		private int ticketLeft_Match1_SouthBack=54;
		private int ticketBought_Match1_SouthBack;
		
		//Match 1 East
		private int ticketLeft_Match1_EastFront=23;
		private int ticketBought_Match1_EastFront;
		
		private int ticketLeft_Match1_EastMiddle=98;
		private int ticketBought_Match1_EastMiddle;
		
		private int ticketLeft_Match1_EastBack=87;
		private int ticketBought_Match1_EastBack;
		
		//Match 1 west
		private int ticketLeft_Match1_WestFront=89;
		private int ticketBought_Match1_WestFront;
		
		private int ticketLeft_Match1_WestMiddle=90;
		private int ticketBought_Match1_WestMiddle;
		
		private int ticketLeft_Match1_WestBack=30;
		private int ticketBought_Match1_WestBack;
		
		//Match 2 North
			private int ticketLeft_Match2_NorthFront = 60;
			private int ticketBought_Match2_NorthFront;
			
			private int ticketLeft_Match2_NorthMiddle=54;
			private int ticketBought_Match2_NorthMiddle;
			
			private int ticketLeft_Match2_NorthBack=65;
			private int ticketBought_Match2_NorthBack;
			
			//Match 1 South
			private int ticketLeft_Match2_SouthFront=76;
			private int ticketBought_Match2_SouthFront;
			
			private int ticketLeft_Match2_SouthMiddle=34;
			private int ticketBought_Match2_SouthMiddle;
			
			private int ticketLeft_Match2_SouthBack=54;
			private int ticketBought_Match2_SouthBack;
			
			//Match 1 East
			private int ticketLeft_Match2_EastFront=54;
			private int ticketBought_Match2_EastFront;
			
			private int ticketLeft_Match2_EastMiddle=76;
			private int ticketBought_Match2_EastMiddle;
			
			private int ticketLeft_Match2_EastBack=45;
			private int ticketBought_Match2_EastBack;
			
			//Match 2 west
			private int ticketLeft_Match2_WestFront=65;
			private int ticketBought_Match2_WestFront;
			
			private int ticketLeft_Match2_WestMiddle=45;
			private int ticketBought_Match2_WestMiddle;
			
			private int ticketLeft_Match2_WestBack=43;
			private int ticketBought_Match2_WestBack;
			
			//Match 3
			//Match 3 North
			private int ticketLeft_Match3_NorthFront = 60;
			private int ticketBought_Match3_NorthFront;
			
			private int ticketLeft_Match3_NorthMiddle=56;
			private int ticketBought_Match3_NorthMiddle;
			
			private int ticketLeft_Match3_NorthBack=100;
			private int ticketBought_Match3_NorthBack;
			
			//Match 3 South
			private int ticketLeft_Match3_SouthFront=45;
			private int ticketBought_Match3_SouthFront;
			
			private int ticketLeft_Match3_SouthMiddle=10;
			private int ticketBought_Match3_SouthMiddle;
			
			private int ticketLeft_Match3_SouthBack=89;
			private int ticketBought_Match3_SouthBack;
			
			//Match 3 East
			private int ticketLeft_Match3_EastFront=70;
			private int ticketBought_Match3_EastFront;
			
			private int ticketLeft_Match3_EastMiddle=78;
			private int ticketBought_Match3_EastMiddle;
			
			private int ticketLeft_Match3_EastBack=55;
			private int ticketBought_Match3_EastBack;
			
			//Match 3 west
			private int ticketLeft_Match3_WestFront=65;
			private int ticketBought_Match3_WestFront;
			
			private int ticketLeft_Match3_WestMiddle=76;
			private int ticketBought_Match3_WestMiddle;
			
			private int ticketLeft_Match3_WestBack=76;
			private int ticketBought_Match3_WestBack;
			
			//
			//Match 3 North
			private int ticketLeft_Match4_NorthFront = 60;
			private int ticketBought_Match4_NorthFront;
			
			private int ticketLeft_Match4_NorthMiddle=76;
			private int ticketBought_Match4_NorthMiddle;
			
			private int ticketLeft_Match4_NorthBack=102;
			private int ticketBought_Match4_NorthBack;
			
			//Match 3 South
			private int ticketLeft_Match4_SouthFront=87;
			private int ticketBought_Match4_SouthFront;
			
			private int ticketLeft_Match4_SouthMiddle=89;
			private int ticketBought_Match4_SouthMiddle;
			
			private int ticketLeft_Match4_SouthBack=98;
			private int ticketBought_Match4_SouthBack;
			
			//Match 4 East
			private int ticketLeft_Match4_EastFront=90;
			private int ticketBought_Match4_EastFront;
			
			private int ticketLeft_Match4_EastMiddle=91;
			private int ticketBought_Match4_EastMiddle;
			
			private int ticketLeft_Match4_EastBack=93;
			private int ticketBought_Match4_EastBack;
			
			//Match 1 west
			private int ticketLeft_Match4_WestFront=95;
			private int ticketBought_Match4_WestFront;
			
			private int ticketLeft_Match4_WestMiddle=95;
			private int ticketBought_Match4_WestMiddle;
			
			private int ticketLeft_Match4_WestBack=99;
			private int ticketBought_Match4_WestBack;
			
			public void decreaseTicketLeft_Match1_NorthFront(int ticketLeft) {
				
				this.ticketLeft_Match1_NorthFront -= ticketLeft;	
			}
			
			public void decreaseTicketLeft_Match1_NorthMiddle(int ticketLeft) {
				
				this.ticketLeft_Match1_NorthMiddle -= ticketLeft;	
			}
			
			
			public void decreaseTicketLeft_Match1_NorthBack(int ticketLeft) {
				
				this.ticketLeft_Match1_NorthBack -= ticketLeft;	
			}
			
			public void decreaseTicketLeft_Match1_SouthFront(int ticketLeft) {
				
				this.setTicketLeft_Match1_SouthFront(this.getTicketLeft_Match1_SouthFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match1_SouthMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match1_SouthMiddle(this.getTicketLeft_Match1_SouthMiddle() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match1_SouthBack(int ticketLeft) {
				
				this.setTicketLeft_Match1_SouthBack(this.getTicketLeft_Match1_SouthBack() - ticketLeft);	
			}
			
			
			public void decreaseTicketLeft_Match1_EastFront(int ticketLeft) {
				
				this.setTicketLeft_Match1_EastFront(this.getTicketLeft_Match1_EastFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match1_EastMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match1_EastMiddle(this.getTicketLeft_Match1_EastMiddle() - ticketLeft);	;	
			}
			
			public void decreaseTicketLeft_Match1_EastBack(int ticketLeft) {
				
				this.setTicketLeft_Match1_EastBack(this.getTicketLeft_Match1_EastBack() - ticketLeft);		
			}
			
			public void decreaseTicketLeft_Match1_WestFront(int ticketLeft) {
				
				this.setTicketLeft_Match1_WestFront(this.getTicketLeft_Match1_WestFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match1_WestMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match1_WestMiddle(this.getTicketLeft_Match1_WestMiddle() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match1_WestBack(int ticketLeft) {
				
				this.setTicketLeft_Match1_WestBack(this.getTicketLeft_Match1_WestBack() - ticketLeft);	
			}
			
			//Match 2
			public void decreaseTicketLeft_Match2_NorthFront(int ticketLeft) {
				
				this.setTicketLeft_Match2_NorthFront(this.getTicketLeft_Match2_NorthFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match2_NorthMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match2_NorthMiddle(this.getTicketLeft_Match2_NorthMiddle() - ticketLeft);	
			}
			
			
			public void decreaseTicketLeft_Match2_NorthBack(int ticketLeft) {
				
				this.setTicketLeft_Match2_NorthBack(this.getTicketLeft_Match2_NorthBack() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match2_SouthFront(int ticketLeft) {
				
				this.setTicketLeft_Match2_SouthFront(this.getTicketLeft_Match2_SouthFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match2_SouthMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match2_SouthMiddle(this.getTicketLeft_Match2_SouthMiddle() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match2_SouthBack(int ticketLeft) {
				
				this.setTicketLeft_Match2_SouthBack(this.getTicketLeft_Match2_SouthBack() - ticketLeft);	
			}
			
			
			public void decreaseTicketLeft_Match2_EastFront(int ticketLeft) {
				
				this.setTicketLeft_Match2_EastFront(this.getTicketLeft_Match2_EastFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match2_EastMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match2_EastMiddle(this.getTicketLeft_Match2_EastMiddle() - ticketLeft);	;	
			}
			
			public void decreaseTicketLeft_Match2_EastBack(int ticketLeft) {
				
				this.setTicketLeft_Match2_EastBack(this.getTicketLeft_Match2_EastBack() - ticketLeft);		
			}
			
			public void decreaseTicketLeft_Match2_WestFront(int ticketLeft) {
				
				this.setTicketLeft_Match2_WestFront(this.getTicketLeft_Match2_WestFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match2_WestMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match2_WestMiddle(this.getTicketLeft_Match2_WestMiddle() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match2_WestBack(int ticketLeft) {
				
				this.setTicketLeft_Match2_WestBack(this.getTicketLeft_Match2_WestBack() - ticketLeft);	
			}
			
			//3
			public void decreaseTicketLeft_Match3_NorthFront(int ticketLeft) {
				
				this.setTicketLeft_Match3_NorthFront(this.getTicketLeft_Match3_NorthFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match3_NorthMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match3_NorthMiddle(this.getTicketLeft_Match3_NorthMiddle() - ticketLeft);	
			}
			
			
			public void decreaseTicketLeft_Match3_NorthBack(int ticketLeft) {
				
				this.setTicketLeft_Match3_NorthBack(this.getTicketLeft_Match3_NorthBack() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match3_SouthFront(int ticketLeft) {
				
				this.setTicketLeft_Match3_SouthFront(this.getTicketLeft_Match3_SouthFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match3_SouthMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match3_SouthMiddle(this.getTicketLeft_Match3_SouthMiddle() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match3_SouthBack(int ticketLeft) {
				
				this.setTicketLeft_Match3_SouthBack(this.getTicketLeft_Match3_SouthBack() - ticketLeft);	
			}
			
			
			public void decreaseTicketLeft_Match3_EastFront(int ticketLeft) {
				
				this.setTicketLeft_Match3_EastFront(this.getTicketLeft_Match3_EastFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match3_EastMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match3_EastMiddle(this.getTicketLeft_Match3_EastMiddle() - ticketLeft);	;	
			}
			
			public void decreaseTicketLeft_Match3_EastBack(int ticketLeft) {
				
				this.setTicketLeft_Match3_EastBack(this.getTicketLeft_Match3_EastBack() - ticketLeft);		
			}
			
			public void decreaseTicketLeft_Match3_WestFront(int ticketLeft) {
				
				this.setTicketLeft_Match3_WestFront(this.getTicketLeft_Match3_WestFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match3_WestMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match3_WestMiddle(this.getTicketLeft_Match3_WestMiddle() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match3_WestBack(int ticketLeft) {
				
				this.setTicketLeft_Match3_WestBack(this.getTicketLeft_Match3_WestBack() - ticketLeft);	
			}
			
			
			//4
			
			public void decreaseTicketLeft_Match4_NorthFront(int ticketLeft) {
				
				this.setTicketLeft_Match4_NorthFront(this.getTicketLeft_Match4_NorthFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match4_NorthMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match4_NorthMiddle(this.getTicketLeft_Match4_NorthMiddle() - ticketLeft);	
			}
			
			
			public void decreaseTicketLeft_Match4_NorthBack(int ticketLeft) {
				
				this.setTicketLeft_Match4_NorthBack(this.getTicketLeft_Match4_NorthBack() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match4_SouthFront(int ticketLeft) {
				
				this.setTicketLeft_Match4_SouthFront(this.getTicketLeft_Match4_SouthFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match4_SouthMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match4_SouthMiddle(this.getTicketLeft_Match4_SouthMiddle() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match4_SouthBack(int ticketLeft) {
				
				this.setTicketLeft_Match4_SouthBack(this.getTicketLeft_Match4_SouthBack() - ticketLeft);	
			}
			
			
			public void decreaseTicketLeft_Match4_EastFront(int ticketLeft) {
				
				this.setTicketLeft_Match4_EastFront(this.getTicketLeft_Match4_EastFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match4_EastMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match4_EastMiddle(this.getTicketLeft_Match4_EastMiddle() - ticketLeft);	;	
			}
			
			public void decreaseTicketLeft_Match4_EastBack(int ticketLeft) {
				
				this.setTicketLeft_Match4_EastBack(this.getTicketLeft_Match4_EastBack() - ticketLeft);		
			}
			
			public void decreaseTicketLeft_Match4_WestFront(int ticketLeft) {
				
				this.setTicketLeft_Match4_WestFront(this.getTicketLeft_Match4_WestFront() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match4_WestMiddle(int ticketLeft) {
				
				this.setTicketLeft_Match4_WestMiddle(this.getTicketLeft_Match4_WestMiddle() - ticketLeft);	
			}
			
			public void decreaseTicketLeft_Match4_WestBack(int ticketLeft) {
				
				this.setTicketLeft_Match4_WestBack(this.getTicketLeft_Match4_WestBack() - ticketLeft);	
			}
			
			
			
			public int getTicketLeft_Match1_NorthFront() {
				return ticketLeft_Match1_NorthFront;
			}

			public void setTicketLeft_Match1_NorthFront(int ticketLeft_Match1_NorthFront) {
				this.ticketLeft_Match1_NorthFront = ticketLeft_Match1_NorthFront;
			}

			public int getTicketBought_Match1_NorthMiddle() {
				return ticketBought_Match1_NorthMiddle;
			}

			public void setTicketBought_Match1_NorthMiddle(int ticketBought_Match1_NorthMiddle) {
				this.ticketBought_Match1_NorthMiddle = ticketBought_Match1_NorthMiddle;
			}

			public int getTicketBought_Match1_NorthBack() {
				return ticketBought_Match1_NorthBack;
			}

			public void setTicketBought_Match1_NorthBack(int ticketBought_Match1_NorthBack) {
				this.ticketBought_Match1_NorthBack = ticketBought_Match1_NorthBack;
			}

			public int getTicketBought_Match1_NorthFront() {
				return ticketBought_Match1_NorthFront;
			}

			public void setTicketBought_Match1_NorthFront(int ticketBought_Match1_NorthFront) {
				this.ticketBought_Match1_NorthFront = ticketBought_Match1_NorthFront;
			}

			public int getTicketLeft_Match1_NorthMiddle() {
				return ticketLeft_Match1_NorthMiddle;
			}

			public void setTicketLeft_Match1_NorthMiddle(int ticketLeft_Match1_NorthMiddle) {
				this.ticketLeft_Match1_NorthMiddle = ticketLeft_Match1_NorthMiddle;
			}

			public int getTicketLeft_Match1_NorthBack() {
				return ticketLeft_Match1_NorthBack;
			}

			public void setTicketLeft_Match1_NorthBack(int ticketLeft_Match1_NorthBack) {
				this.ticketLeft_Match1_NorthBack = ticketLeft_Match1_NorthBack;
			}

			public int getTicketLeft_Match1_SouthFront() {
				return ticketLeft_Match1_SouthFront;
			}

			public void setTicketLeft_Match1_SouthFront(int ticketLeft_Match1_SouthFront) {
				this.ticketLeft_Match1_SouthFront = ticketLeft_Match1_SouthFront;
			}

			public int getTicketBought_Match1_SouthFront() {
				return ticketBought_Match1_SouthFront;
			}

			public void setTicketBought_Match1_SouthFront(int ticketBought_Match1_SouthFront) {
				this.ticketBought_Match1_SouthFront = ticketBought_Match1_SouthFront;
			}

			public int getTicketLeft_Match1_SouthMiddle() {
				return ticketLeft_Match1_SouthMiddle;
			}

			public void setTicketLeft_Match1_SouthMiddle(int ticketLeft_Match1_SouthMiddle) {
				this.ticketLeft_Match1_SouthMiddle = ticketLeft_Match1_SouthMiddle;
			}

			public int getTicketBought_Match1_SouthMiddle() {
				return ticketBought_Match1_SouthMiddle;
			}

			public void setTicketBought_Match1_SouthMiddle(int ticketBought_Match1_SouthMiddle) {
				this.ticketBought_Match1_SouthMiddle = ticketBought_Match1_SouthMiddle;
			}

			public int getTicketLeft_Match1_SouthBack() {
				return ticketLeft_Match1_SouthBack;
			}

			public void setTicketLeft_Match1_SouthBack(int ticketLeft_Match1_SouthBack) {
				this.ticketLeft_Match1_SouthBack = ticketLeft_Match1_SouthBack;
			}

			public int getTicketBought_Match1_SouthBack() {
				return ticketBought_Match1_SouthBack;
			}

			public void setTicketBought_Match1_SouthBack(int ticketBought_Match1_SouthBack) {
				this.ticketBought_Match1_SouthBack = ticketBought_Match1_SouthBack;
			}

			public int getTicketLeft_Match1_EastFront() {
				return ticketLeft_Match1_EastFront;
			}

			public void setTicketLeft_Match1_EastFront(int ticketLeft_Match1_EastFront) {
				this.ticketLeft_Match1_EastFront = ticketLeft_Match1_EastFront;
			}

			public int getTicketBought_Match1_EastFront() {
				return ticketBought_Match1_EastFront;
			}

			public void setTicketBought_Match1_EastFront(int ticketBought_Match1_EastFront) {
				this.ticketBought_Match1_EastFront = ticketBought_Match1_EastFront;
			}

			public int getTicketBought_Match1_EastMiddle() {
				return ticketBought_Match1_EastMiddle;
			}

			public void setTicketBought_Match1_EastMiddle(int ticketBought_Match1_EastMiddle) {
				this.ticketBought_Match1_EastMiddle = ticketBought_Match1_EastMiddle;
			}

			public int getTicketLeft_Match1_EastMiddle() {
				return ticketLeft_Match1_EastMiddle;
			}

			public void setTicketLeft_Match1_EastMiddle(int ticketLeft_Match1_EastMiddle) {
				this.ticketLeft_Match1_EastMiddle = ticketLeft_Match1_EastMiddle;
			}

			public int getTicketLeft_Match1_EastBack() {
				return ticketLeft_Match1_EastBack;
			}

			public void setTicketLeft_Match1_EastBack(int ticketLeft_Match1_EastBack) {
				this.ticketLeft_Match1_EastBack = ticketLeft_Match1_EastBack;
			}

			public int getTicketBought_Match1_EastBack() {
				return ticketBought_Match1_EastBack;
			}

			public void setTicketBought_Match1_EastBack(int ticketBought_Match1_EastBack) {
				this.ticketBought_Match1_EastBack = ticketBought_Match1_EastBack;
			}

			public int getTicketLeft_Match1_WestFront() {
				return ticketLeft_Match1_WestFront;
			}

			public void setTicketLeft_Match1_WestFront(int ticketLeft_Match1_WestFront) {
				this.ticketLeft_Match1_WestFront = ticketLeft_Match1_WestFront;
			}

			public int getTicketBought_Match1_WestFront() {
				return ticketBought_Match1_WestFront;
			}

			public void setTicketBought_Match1_WestFront(int ticketBought_Match1_WestFront) {
				this.ticketBought_Match1_WestFront = ticketBought_Match1_WestFront;
			}

			public int getTicketLeft_Match1_WestMiddle() {
				return ticketLeft_Match1_WestMiddle;
			}

			public void setTicketLeft_Match1_WestMiddle(int ticketLeft_Match1_WestMiddle) {
				this.ticketLeft_Match1_WestMiddle = ticketLeft_Match1_WestMiddle;
			}

			public int getTicketBought_Match1_WestMiddle() {
				return ticketBought_Match1_WestMiddle;
			}

			public void setTicketBought_Match1_WestMiddle(int ticketBought_Match1_WestMiddle) {
				this.ticketBought_Match1_WestMiddle = ticketBought_Match1_WestMiddle;
			}

			public int getTicketLeft_Match1_WestBack() {
				return ticketLeft_Match1_WestBack;
			}

			public void setTicketLeft_Match1_WestBack(int ticketLeft_Match1_WestBack) {
				this.ticketLeft_Match1_WestBack = ticketLeft_Match1_WestBack;
			}

			public int getTicketBought_Match1_WestBack() {
				return ticketBought_Match1_WestBack;
			}

			public void setTicketBought_Match1_WestBack(int ticketBought_Match1_WestBack) {
				this.ticketBought_Match1_WestBack = ticketBought_Match1_WestBack;
			}

			public int getTicketLeft_Match2_NorthFront() {
				return ticketLeft_Match2_NorthFront;
			}

			public void setTicketLeft_Match2_NorthFront(int ticketLeft_Match2_NorthFront) {
				this.ticketLeft_Match2_NorthFront = ticketLeft_Match2_NorthFront;
			}

			public int getTicketBought_Match2_NorthFront() {
				return ticketBought_Match2_NorthFront;
			}

			public void setTicketBought_Match2_NorthFront(int ticketBought_Match2_NorthFront) {
				this.ticketBought_Match2_NorthFront = ticketBought_Match2_NorthFront;
			}

			public int getTicketLeft_Match2_NorthMiddle() {
				return ticketLeft_Match2_NorthMiddle;
			}

			public void setTicketLeft_Match2_NorthMiddle(int ticketLeft_Match2_NorthMiddle) {
				this.ticketLeft_Match2_NorthMiddle = ticketLeft_Match2_NorthMiddle;
			}

			public int getTicketBought_Match2_NorthMiddle() {
				return ticketBought_Match2_NorthMiddle;
			}

			public void setTicketBought_Match2_NorthMiddle(int ticketBought_Match2_NorthMiddle) {
				this.ticketBought_Match2_NorthMiddle = ticketBought_Match2_NorthMiddle;
			}

			public int getTicketLeft_Match2_NorthBack() {
				return ticketLeft_Match2_NorthBack;
			}

			public void setTicketLeft_Match2_NorthBack(int ticketLeft_Match2_NorthBack) {
				this.ticketLeft_Match2_NorthBack = ticketLeft_Match2_NorthBack;
			}

			public int getTicketBought_Match2_NorthBack() {
				return ticketBought_Match2_NorthBack;
			}

			public void setTicketBought_Match2_NorthBack(int ticketBought_Match2_NorthBack) {
				this.ticketBought_Match2_NorthBack = ticketBought_Match2_NorthBack;
			}

			public int getTicketLeft_Match2_SouthFront() {
				return ticketLeft_Match2_SouthFront;
			}

			public void setTicketLeft_Match2_SouthFront(int ticketLeft_Match2_SouthFront) {
				this.ticketLeft_Match2_SouthFront = ticketLeft_Match2_SouthFront;
			}

			public int getTicketBought_Match2_SouthFront() {
				return ticketBought_Match2_SouthFront;
			}

			public void setTicketBought_Match2_SouthFront(int ticketBought_Match2_SouthFront) {
				this.ticketBought_Match2_SouthFront = ticketBought_Match2_SouthFront;
			}

			public int getTicketLeft_Match2_SouthMiddle() {
				return ticketLeft_Match2_SouthMiddle;
			}

			public void setTicketLeft_Match2_SouthMiddle(int ticketLeft_Match2_SouthMiddle) {
				this.ticketLeft_Match2_SouthMiddle = ticketLeft_Match2_SouthMiddle;
			}

			public int getTicketBought_Match2_SouthMiddle() {
				return ticketBought_Match2_SouthMiddle;
			}

			public void setTicketBought_Match2_SouthMiddle(int ticketBought_Match2_SouthMiddle) {
				this.ticketBought_Match2_SouthMiddle = ticketBought_Match2_SouthMiddle;
			}

			public int getTicketLeft_Match2_SouthBack() {
				return ticketLeft_Match2_SouthBack;
			}

			public void setTicketLeft_Match2_SouthBack(int ticketLeft_Match2_SouthBack) {
				this.ticketLeft_Match2_SouthBack = ticketLeft_Match2_SouthBack;
			}

			public int getTicketBought_Match2_SouthBack() {
				return ticketBought_Match2_SouthBack;
			}

			public void setTicketBought_Match2_SouthBack(int ticketBought_Match2_SouthBack) {
				this.ticketBought_Match2_SouthBack = ticketBought_Match2_SouthBack;
			}

			public int getTicketLeft_Match2_EastFront() {
				return ticketLeft_Match2_EastFront;
			}

			public void setTicketLeft_Match2_EastFront(int ticketLeft_Match2_EastFront) {
				this.ticketLeft_Match2_EastFront = ticketLeft_Match2_EastFront;
			}

			public int getTicketBought_Match2_EastFront() {
				return ticketBought_Match2_EastFront;
			}

			public void setTicketBought_Match2_EastFront(int ticketBought_Match2_EastFront) {
				this.ticketBought_Match2_EastFront = ticketBought_Match2_EastFront;
			}

			public int getTicketLeft_Match2_EastMiddle() {
				return ticketLeft_Match2_EastMiddle;
			}

			public void setTicketLeft_Match2_EastMiddle(int ticketLeft_Match2_EastMiddle) {
				this.ticketLeft_Match2_EastMiddle = ticketLeft_Match2_EastMiddle;
			}

			public int getTicketBought_Match2_EastMiddle() {
				return ticketBought_Match2_EastMiddle;
			}

			public void setTicketBought_Match2_EastMiddle(int ticketBought_Match2_EastMiddle) {
				this.ticketBought_Match2_EastMiddle = ticketBought_Match2_EastMiddle;
			}

			public int getTicketLeft_Match2_EastBack() {
				return ticketLeft_Match2_EastBack;
			}

			public void setTicketLeft_Match2_EastBack(int ticketLeft_Match2_EastBack) {
				this.ticketLeft_Match2_EastBack = ticketLeft_Match2_EastBack;
			}

			public int getTicketBought_Match2_EastBack() {
				return ticketBought_Match2_EastBack;
			}

			public void setTicketBought_Match2_EastBack(int ticketBought_Match2_EastBack) {
				this.ticketBought_Match2_EastBack = ticketBought_Match2_EastBack;
			}

			public int getTicketLeft_Match2_WestFront() {
				return ticketLeft_Match2_WestFront;
			}

			public void setTicketLeft_Match2_WestFront(int ticketLeft_Match2_WestFront) {
				this.ticketLeft_Match2_WestFront = ticketLeft_Match2_WestFront;
			}

			public int getTicketBought_Match2_WestFront() {
				return ticketBought_Match2_WestFront;
			}

			public void setTicketBought_Match2_WestFront(int ticketBought_Match2_WestFront) {
				this.ticketBought_Match2_WestFront = ticketBought_Match2_WestFront;
			}

			public int getTicketLeft_Match2_WestMiddle() {
				return ticketLeft_Match2_WestMiddle;
			}

			public void setTicketLeft_Match2_WestMiddle(int ticketLeft_Match2_WestMiddle) {
				this.ticketLeft_Match2_WestMiddle = ticketLeft_Match2_WestMiddle;
			}

			public int getTicketBought_Match2_WestMiddle() {
				return ticketBought_Match2_WestMiddle;
			}

			public void setTicketBought_Match2_WestMiddle(int ticketBought_Match2_WestMiddle) {
				this.ticketBought_Match2_WestMiddle = ticketBought_Match2_WestMiddle;
			}

			public int getTicketLeft_Match2_WestBack() {
				return ticketLeft_Match2_WestBack;
			}

			public void setTicketLeft_Match2_WestBack(int ticketLeft_Match2_WestBack) {
				this.ticketLeft_Match2_WestBack = ticketLeft_Match2_WestBack;
			}

			public int getTicketBought_Match2_WestBack() {
				return ticketBought_Match2_WestBack;
			}

			public void setTicketBought_Match2_WestBack(int ticketBought_Match2_WestBack) {
				this.ticketBought_Match2_WestBack = ticketBought_Match2_WestBack;
			}

			public int getTicketLeft_Match3_NorthFront() {
				return ticketLeft_Match3_NorthFront;
			}

			public void setTicketLeft_Match3_NorthFront(int ticketLeft_Match3_NorthFront) {
				this.ticketLeft_Match3_NorthFront = ticketLeft_Match3_NorthFront;
			}

			public int getTicketBought_Match3_NorthFront() {
				return ticketBought_Match3_NorthFront;
			}

			public void setTicketBought_Match3_NorthFront(int ticketBought_Match3_NorthFront) {
				this.ticketBought_Match3_NorthFront = ticketBought_Match3_NorthFront;
			}

			public int getTicketLeft_Match3_NorthMiddle() {
				return ticketLeft_Match3_NorthMiddle;
			}

			public void setTicketLeft_Match3_NorthMiddle(int ticketLeft_Match3_NorthMiddle) {
				this.ticketLeft_Match3_NorthMiddle = ticketLeft_Match3_NorthMiddle;
			}

			public int getTicketBought_Match3_NorthMiddle() {
				return ticketBought_Match3_NorthMiddle;
			}

			public void setTicketBought_Match3_NorthMiddle(int ticketBought_Match3_NorthMiddle) {
				this.ticketBought_Match3_NorthMiddle = ticketBought_Match3_NorthMiddle;
			}

			public int getTicketLeft_Match3_NorthBack() {
				return ticketLeft_Match3_NorthBack;
			}

			public void setTicketLeft_Match3_NorthBack(int ticketLeft_Match3_NorthBack) {
				this.ticketLeft_Match3_NorthBack = ticketLeft_Match3_NorthBack;
			}

			public int getTicketBought_Match3_NorthBack() {
				return ticketBought_Match3_NorthBack;
			}

			public void setTicketBought_Match3_NorthBack(int ticketBought_Match3_NorthBack) {
				this.ticketBought_Match3_NorthBack = ticketBought_Match3_NorthBack;
			}

			public int getTicketLeft_Match3_SouthFront() {
				return ticketLeft_Match3_SouthFront;
			}

			public void setTicketLeft_Match3_SouthFront(int ticketLeft_Match3_SouthFront) {
				this.ticketLeft_Match3_SouthFront = ticketLeft_Match3_SouthFront;
			}

			public int getTicketBought_Match3_SouthFront() {
				return ticketBought_Match3_SouthFront;
			}

			public void setTicketBought_Match3_SouthFront(int ticketBought_Match3_SouthFront) {
				this.ticketBought_Match3_SouthFront = ticketBought_Match3_SouthFront;
			}

			public int getTicketLeft_Match3_SouthMiddle() {
				return ticketLeft_Match3_SouthMiddle;
			}

			public void setTicketLeft_Match3_SouthMiddle(int ticketLeft_Match3_SouthMiddle) {
				this.ticketLeft_Match3_SouthMiddle = ticketLeft_Match3_SouthMiddle;
			}

			public int getTicketBought_Match3_SouthMiddle() {
				return ticketBought_Match3_SouthMiddle;
			}

			public void setTicketBought_Match3_SouthMiddle(int ticketBought_Match3_SouthMiddle) {
				this.ticketBought_Match3_SouthMiddle = ticketBought_Match3_SouthMiddle;
			}

			public int getTicketLeft_Match3_SouthBack() {
				return ticketLeft_Match3_SouthBack;
			}

			public void setTicketLeft_Match3_SouthBack(int ticketLeft_Match3_SouthBack) {
				this.ticketLeft_Match3_SouthBack = ticketLeft_Match3_SouthBack;
			}

			public int getTicketBought_Match3_SouthBack() {
				return ticketBought_Match3_SouthBack;
			}

			public void setTicketBought_Match3_SouthBack(int ticketBought_Match3_SouthBack) {
				this.ticketBought_Match3_SouthBack = ticketBought_Match3_SouthBack;
			}

			public int getTicketLeft_Match3_EastFront() {
				return ticketLeft_Match3_EastFront;
			}

			public void setTicketLeft_Match3_EastFront(int ticketLeft_Match3_EastFront) {
				this.ticketLeft_Match3_EastFront = ticketLeft_Match3_EastFront;
			}

			public int getTicketBought_Match3_EastFront() {
				return ticketBought_Match3_EastFront;
			}

			public void setTicketBought_Match3_EastFront(int ticketBought_Match3_EastFront) {
				this.ticketBought_Match3_EastFront = ticketBought_Match3_EastFront;
			}

			public int getTicketLeft_Match3_EastMiddle() {
				return ticketLeft_Match3_EastMiddle;
			}

			public void setTicketLeft_Match3_EastMiddle(int ticketLeft_Match3_EastMiddle) {
				this.ticketLeft_Match3_EastMiddle = ticketLeft_Match3_EastMiddle;
			}

			public int getTicketBought_Match3_EastMiddle() {
				return ticketBought_Match3_EastMiddle;
			}

			public void setTicketBought_Match3_EastMiddle(int ticketBought_Match3_EastMiddle) {
				this.ticketBought_Match3_EastMiddle = ticketBought_Match3_EastMiddle;
			}

			public int getTicketLeft_Match3_EastBack() {
				return ticketLeft_Match3_EastBack;
			}

			public void setTicketLeft_Match3_EastBack(int ticketLeft_Match3_EastBack) {
				this.ticketLeft_Match3_EastBack = ticketLeft_Match3_EastBack;
			}

			public int getTicketBought_Match3_EastBack() {
				return ticketBought_Match3_EastBack;
			}

			public void setTicketBought_Match3_EastBack(int ticketBought_Match3_EastBack) {
				this.ticketBought_Match3_EastBack = ticketBought_Match3_EastBack;
			}

			public int getTicketLeft_Match3_WestFront() {
				return ticketLeft_Match3_WestFront;
			}

			public void setTicketLeft_Match3_WestFront(int ticketLeft_Match3_WestFront) {
				this.ticketLeft_Match3_WestFront = ticketLeft_Match3_WestFront;
			}

			public int getTicketBought_Match3_WestFront() {
				return ticketBought_Match3_WestFront;
			}

			public void setTicketBought_Match3_WestFront(int ticketBought_Match3_WestFront) {
				this.ticketBought_Match3_WestFront = ticketBought_Match3_WestFront;
			}

			public int getTicketLeft_Match3_WestMiddle() {
				return ticketLeft_Match3_WestMiddle;
			}

			public void setTicketLeft_Match3_WestMiddle(int ticketLeft_Match3_WestMiddle) {
				this.ticketLeft_Match3_WestMiddle = ticketLeft_Match3_WestMiddle;
			}

			public int getTicketBought_Match3_WestMiddle() {
				return ticketBought_Match3_WestMiddle;
			}

			public void setTicketBought_Match3_WestMiddle(int ticketBought_Match3_WestMiddle) {
				this.ticketBought_Match3_WestMiddle = ticketBought_Match3_WestMiddle;
			}

			public int getTicketLeft_Match3_WestBack() {
				return ticketLeft_Match3_WestBack;
			}

			public void setTicketLeft_Match3_WestBack(int ticketLeft_Match3_WestBack) {
				this.ticketLeft_Match3_WestBack = ticketLeft_Match3_WestBack;
			}

			public int getTicketBought_Match3_WestBack() {
				return ticketBought_Match3_WestBack;
			}

			public void setTicketBought_Match3_WestBack(int ticketBought_Match3_WestBack) {
				this.ticketBought_Match3_WestBack = ticketBought_Match3_WestBack;
			}

			public int getTicketLeft_Match4_NorthFront() {
				return ticketLeft_Match4_NorthFront;
			}

			public void setTicketLeft_Match4_NorthFront(int ticketLeft_Match4_NorthFront) {
				this.ticketLeft_Match4_NorthFront = ticketLeft_Match4_NorthFront;
			}

			public int getTicketBought_Match4_NorthFront() {
				return ticketBought_Match4_NorthFront;
			}

			public void setTicketBought_Match4_NorthFront(int ticketBought_Match4_NorthFront) {
				this.ticketBought_Match4_NorthFront = ticketBought_Match4_NorthFront;
			}

			public int getTicketLeft_Match4_NorthMiddle() {
				return ticketLeft_Match4_NorthMiddle;
			}

			public void setTicketLeft_Match4_NorthMiddle(int ticketLeft_Match4_NorthMiddle) {
				this.ticketLeft_Match4_NorthMiddle = ticketLeft_Match4_NorthMiddle;
			}

			public int getTicketBought_Match4_NorthMiddle() {
				return ticketBought_Match4_NorthMiddle;
			}

			public void setTicketBought_Match4_NorthMiddle(int ticketBought_Match4_NorthMiddle) {
				this.ticketBought_Match4_NorthMiddle = ticketBought_Match4_NorthMiddle;
			}

			public int getTicketLeft_Match4_NorthBack() {
				return ticketLeft_Match4_NorthBack;
			}

			public void setTicketLeft_Match4_NorthBack(int ticketLeft_Match4_NorthBack) {
				this.ticketLeft_Match4_NorthBack = ticketLeft_Match4_NorthBack;
			}

			public int getTicketBought_Match4_NorthBack() {
				return ticketBought_Match4_NorthBack;
			}

			public void setTicketBought_Match4_NorthBack(int ticketBought_Match4_NorthBack) {
				this.ticketBought_Match4_NorthBack = ticketBought_Match4_NorthBack;
			}

			public int getTicketLeft_Match4_SouthFront() {
				return ticketLeft_Match4_SouthFront;
			}

			public void setTicketLeft_Match4_SouthFront(int ticketLeft_Match4_SouthFront) {
				this.ticketLeft_Match4_SouthFront = ticketLeft_Match4_SouthFront;
			}

			public int getTicketBought_Match4_SouthFront() {
				return ticketBought_Match4_SouthFront;
			}

			public void setTicketBought_Match4_SouthFront(int ticketBought_Match4_SouthFront) {
				this.ticketBought_Match4_SouthFront = ticketBought_Match4_SouthFront;
			}

			public int getTicketLeft_Match4_SouthMiddle() {
				return ticketLeft_Match4_SouthMiddle;
			}

			public void setTicketLeft_Match4_SouthMiddle(int ticketLeft_Match4_SouthMiddle) {
				this.ticketLeft_Match4_SouthMiddle = ticketLeft_Match4_SouthMiddle;
			}

			public int getTicketBought_Match4_SouthMiddle() {
				return ticketBought_Match4_SouthMiddle;
			}

			public void setTicketBought_Match4_SouthMiddle(int ticketBought_Match4_SouthMiddle) {
				this.ticketBought_Match4_SouthMiddle = ticketBought_Match4_SouthMiddle;
			}

			public int getTicketLeft_Match4_SouthBack() {
				return ticketLeft_Match4_SouthBack;
			}

			public void setTicketLeft_Match4_SouthBack(int ticketLeft_Match4_SouthBack) {
				this.ticketLeft_Match4_SouthBack = ticketLeft_Match4_SouthBack;
			}

			public int getTicketBought_Match4_SouthBack() {
				return ticketBought_Match4_SouthBack;
			}

			public void setTicketBought_Match4_SouthBack(int ticketBought_Match4_SouthBack) {
				this.ticketBought_Match4_SouthBack = ticketBought_Match4_SouthBack;
			}

			public int getTicketLeft_Match4_EastFront() {
				return ticketLeft_Match4_EastFront;
			}

			public void setTicketLeft_Match4_EastFront(int ticketLeft_Match4_EastFront) {
				this.ticketLeft_Match4_EastFront = ticketLeft_Match4_EastFront;
			}

			public int getTicketBought_Match4_EastFront() {
				return ticketBought_Match4_EastFront;
			}

			public void setTicketBought_Match4_EastFront(int ticketBought_Match4_EastFront) {
				this.ticketBought_Match4_EastFront = ticketBought_Match4_EastFront;
			}

			public int getTicketLeft_Match4_EastMiddle() {
				return ticketLeft_Match4_EastMiddle;
			}

			public void setTicketLeft_Match4_EastMiddle(int ticketLeft_Match4_EastMiddle) {
				this.ticketLeft_Match4_EastMiddle = ticketLeft_Match4_EastMiddle;
			}

			public int getTicketBought_Match4_EastMiddle() {
				return ticketBought_Match4_EastMiddle;
			}

			public void setTicketBought_Match4_EastMiddle(int ticketBought_Match4_EastMiddle) {
				this.ticketBought_Match4_EastMiddle = ticketBought_Match4_EastMiddle;
			}

			public int getTicketLeft_Match4_EastBack() {
				return ticketLeft_Match4_EastBack;
			}

			public void setTicketLeft_Match4_EastBack(int ticketLeft_Match4_EastBack) {
				this.ticketLeft_Match4_EastBack = ticketLeft_Match4_EastBack;
			}

			public int getTicketBought_Match4_EastBack() {
				return ticketBought_Match4_EastBack;
			}

			public void setTicketBought_Match4_EastBack(int ticketBought_Match4_EastBack) {
				this.ticketBought_Match4_EastBack = ticketBought_Match4_EastBack;
			}

			public int getTicketLeft_Match4_WestFront() {
				return ticketLeft_Match4_WestFront;
			}

			public void setTicketLeft_Match4_WestFront(int ticketLeft_Match4_WestFront) {
				this.ticketLeft_Match4_WestFront = ticketLeft_Match4_WestFront;
			}

			public int getTicketBought_Match4_WestFront() {
				return ticketBought_Match4_WestFront;
			}

			public void setTicketBought_Match4_WestFront(int ticketBought_Match4_WestFront) {
				this.ticketBought_Match4_WestFront = ticketBought_Match4_WestFront;
			}

			public int getTicketLeft_Match4_WestMiddle() {
				return ticketLeft_Match4_WestMiddle;
			}

			public void setTicketLeft_Match4_WestMiddle(int ticketLeft_Match4_WestMiddle) {
				this.ticketLeft_Match4_WestMiddle = ticketLeft_Match4_WestMiddle;
			}

			public int getTicketBought_Match4_WestMiddle() {
				return ticketBought_Match4_WestMiddle;
			}

			public void setTicketBought_Match4_WestMiddle(int ticketBought_Match4_WestMiddle) {
				this.ticketBought_Match4_WestMiddle = ticketBought_Match4_WestMiddle;
			}

			public int getTicketLeft_Match4_WestBack() {
				return ticketLeft_Match4_WestBack;
			}

			public void setTicketLeft_Match4_WestBack(int ticketLeft_Match4_WestBack) {
				this.ticketLeft_Match4_WestBack = ticketLeft_Match4_WestBack;
			}

			public int getTicketBought_Match4_WestBack() {
				return ticketBought_Match4_WestBack;
			}

			public void setTicketBought_Match4_WestBack(int ticketBought_Match4_WestBack) {
				this.ticketBought_Match4_WestBack = ticketBought_Match4_WestBack;
			}
			
			

}
