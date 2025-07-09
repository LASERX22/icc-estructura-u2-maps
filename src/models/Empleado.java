package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Empleado))
            return false;
        Empleado empleado = (Empleado) obj;
        return id == empleado.id && name.equals(empleado.name) && position.equals(empleado.position);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    @Override
    public int compareTo(Empleado o) { // Comparador recibe dos, comparable solo 1
        if (this.id != o.id) {
            return Integer.compare(this.id, o.id);
        }
        return this.name.compareTo(o.name);
    }
}