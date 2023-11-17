package org.example.Queue;

import org.example.model.Song;

public class Queue {
    private int capacity;
    private int size;

    private Song[] playlist;

    public Queue(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.playlist = new Song[capacity];
    }

    private boolean isEmpty(){return size == 0;}

    private boolean isFull(){return size >= capacity;}

    public void enqueue(Song song){
        if (isFull()){return;}

        playlist[size++] = song;
    }

    public Song dequeue(){
        if (isEmpty()){return null;}
        Song removedSong = playlist[0];
        playlist[0] = null;
        Song[] newPlayist = new Song[capacity];
        for (int i = 1; i < size; i++){
            newPlayist[i-1] = playlist[i];
        }
        playlist = newPlayist;
        --size;
        return removedSong;
    }

    public Song peek(){
        if (isEmpty()){return null;}
        return playlist[0];
    }

    public void printPlaylist(){
        for (int i = 0; i < size; i++){
            System.out.println(playlist[i]);
        }
    }

    public static void main(String[] args){
        Song song = new Song("Many men", "50 Cent");
        Song song1 = new Song("6'7","Lil Wayne ft Cory gunz");
        Song song2 = new Song("Super Bass", "Nicki Minaj");
        Song song3 = new Song("Wasted","Lil Wayne");
        Song song4 = new Song("Monster", "Nicki Minaj");
        Song song5 = new Song("anaconda", "Nicki Minaj");
        Queue queue = new Queue(5);

        queue.enqueue(song);
        queue.enqueue(song1);
        queue.enqueue(song2);
        queue.enqueue(song3);
        queue.enqueue(song4);
        queue.enqueue(song5);


        queue.dequeue();
        System.out.println(queue.peek());


        //queue.printPlaylist();
    }
}
