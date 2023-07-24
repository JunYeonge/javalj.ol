package a0710;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
        // TODO Auto-generated method stub
        
    }
    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        // TODO Auto-generated method stub
        System.out.println("현재 Audio 볼륨 : " + volume );
    }
}
