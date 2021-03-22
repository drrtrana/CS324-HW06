package problem1;

public class Box implements Comparable<Box> {

    private int volume;
    private int available;

    public Box(int volume) {
        this.volume = volume;
    }

    public Box(int volume, int available) {
        this.volume = volume;
        this.available = available;
    }

    public int getAvailable() { return this.available; }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Box))
            return false;
        return this.volume == ((Box) o).volume;
    }

    @Override
    public int hashCode() {
        return ((Integer) this.volume).hashCode();
    }

    @Override
    public int compareTo(Box o) {
        if (this.volume < o.volume)
            return -1;
        else if (this.volume > o.volume)
            return 1;
        else
            return 0;
    }
}
