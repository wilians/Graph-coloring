package graphcoloring;

import java.util.List;

/**
 *
 * @author p1401687
 */
public class Vertex {
    
    private List<Vertex> _lNeighbour;
    private String _color;
    private int _name;

    public Vertex() {
        
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        this._color = color;
    }

    void addNeightbour(Vertex b) {
        
    }
    
}