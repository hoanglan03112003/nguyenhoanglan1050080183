package mypackage;

public class Vector {
        private double x;
        private double y;
        private double z;
        public Vector(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public Vector add(Vector v) {
            double newX = this.x + v.x;
            double newY = this.y + v.y;
            double newZ = this.z + v.z;
            return new Vector(newX, newY, newZ);
        }
        public Vector subtract(Vector v) {
            double newX = this.x - v.x;
            double newY = this.y - v.y;
            double newZ = this.z - v.z;
            return new Vector(newX, newY, newZ);
        }
        public Vector multiply(double scalar) {
            double newX = this.x * scalar;
            double newY = this.y * scalar;
            double newZ = this.z * scalar;
            return new Vector(newX, newY, newZ);
        }
        public double dotProduct(Vector v) {
            return this.x * v.x + this.y * v.y + this.z * v.z;
        }
    }
    

