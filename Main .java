interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }

    void display() {
        System.out.println("SmartPhone supports Camera and Music Player");
    }
}

class Main1 {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        phone.display();
        phone.takePhoto();
        phone.playMusic();
    }
}