package com.thomasswonger.week_10;

import java.util.ArrayList;

class File {
    protected String location;

    public File(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public byte[] read() {
        // open file and read data
        return null;
    }
}

interface Displayable {
    void display();
}

interface Playable {
    void play();
}

interface  Shareable {
    void shareOnFacebook(String username, String password);
    void shareOnTwitter(String username, String password);
}

class Picture extends File implements Displayable, Shareable{


    public Picture(String location) {
        super(location);
    }

    @Override
    public void display() {
        System.out.println("Display picture from: " + location);
    }

    @Override
    public void shareOnFacebook(String username, String password) {
        System.out.println("Sharing picture on facebook");
    }

    @Override
    public void shareOnTwitter(String username, String password) {
        System.out.println("Sharing picture on twitter");
    }
}

class Song extends File implements Playable, Shareable {

    public Song(String location) {
        super(location);
    }

    @Override
    public void play() {
        System.out.println("Playing song from: " + location);
    }

    @Override
    public void shareOnFacebook(String username, String password) {
        System.out.println("Sharing song on facebook");
    }

    @Override
    public void shareOnTwitter(String username, String password) {
        System.out.println("Sharing song on twitter");
    }
}

class Video extends File implements Playable, Shareable{

    public Video(String location) {
        super(location);
    }

    @Override
    public void play() {
        System.out.println("Playing video from: " + location);
    }

    @Override
    public void shareOnFacebook(String username, String password) {
        System.out.println("Sharing video on facebook");
    }

    @Override
    public void shareOnTwitter(String username, String password) {
        System.out.println("Sharing video on twitter");
    }
}

class Playlist extends ArrayList<Playable> {
    public void playAll(){
        for(Playable item: this){
            item.play();
        }
    }

}

public class Main {
    public static void main(String[] args){

       Playlist myCoolPlaylist = new Playlist();

        Song aSong = new Song("C:/song.mp3");
        Video aVideo = new Video("C:/video.avi");

        myCoolPlaylist.add(aSong);
        myCoolPlaylist.add(aVideo);

        myCoolPlaylist.playAll();
    }
}
