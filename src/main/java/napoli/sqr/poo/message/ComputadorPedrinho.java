package napoli.sqr.poo.message;

import napoli.sqr.poo.message.app.FacebookMessenger;
import napoli.sqr.poo.message.app.InstagramMessenger;
import napoli.sqr.poo.message.app.MSNMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        InstagramMessenger insta = new InstagramMessenger();
        FacebookMessenger face = new FacebookMessenger();

        face.sendMessage();
        face.receveMessage();
        msn.receveMessage();
        msn.sendMessage();
        insta.receveMessage();
        insta.sendMessage();
    }



}



