package fr.bforbank.Etities;

public class Player {

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public void wonTheBall(Player concededPlayer)
    {
        point.next(this,concededPlayer);
    }
    Point point = new Zero();
}
