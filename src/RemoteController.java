
public class RemoteController implements Controller{
		private int volume;
		private boolean state;
		private boolean playing;
		//Attributes
		
		public RemoteController() {
			super();
			volume = 50;
			state = false;
			playing = false;
		}

		private int getVolume() {
			return volume;
		}

		private void setVolume(int volume) {
			this.volume = volume;
		}

		private boolean isState() {
			return state;
		}

		private void setState(boolean state) {
			this.state = state;
		}

		private boolean isPlaying() {
			return playing;
		}

		private void setPlaying(boolean playing) {
			this.playing = playing;
		}

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			this.setState(true);
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			this.setState(false);
		}

		@Override
		public void openMenu() {
			// TODO Auto-generated method stub
			if(this.isState()) {
				System.out.println("State: "+this.isState());
				System.out.println("Volume: "+this.getVolume());
				
				for(int i = 0; i<=this.getVolume();i+=10) {
					System.out.print("|");
				}
				System.out.println("Is playing: "+this.isPlaying());
			}
		}

		@Override
		public void closeMenu() {
			// TODO Auto-generated method stub
			System.out.println("Closing menu...");
		}

		@Override
		public void increaseVolume() {
			// TODO Auto-generated method stub
			if(this.isState()) {
				this.setVolume(this.getVolume()+1);
			}
		}

		@Override
		public void decreaseVolume() {
			// TODO Auto-generated method stub
			if(this.isState()) {
				this.setVolume(this.getVolume()-1);
			}
		}

		@Override
		public void mute() {
			// TODO Auto-generated method stub
			if(this.isState() && this.getVolume()>0) {
				this.setVolume(0);
			}
		}
		
		@Override
		public void unmute() {
			// TODO Auto-generated method stub
			if(this.isState() && this.getVolume()==0) {
				this.setVolume(50);
			}
		}

		@Override
		public void play() {
			// TODO Auto-generated method stub
			if(this.isState() && !(this.isPlaying())){
				this.setPlaying(true);
			}
		}

		@Override
		public void pause() {
			// TODO Auto-generated method stub
			if(this.isState() && this.isPlaying()){
				this.setPlaying(false);
			}
		}
}
