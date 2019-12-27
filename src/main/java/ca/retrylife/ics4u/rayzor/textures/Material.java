package ca.retrylife.ics4u.rayzor.textures;

import javax.vecmath.Color3f;

/**
 * Renderable material base class
 */
public class Material {

    /**
     * Material color vector
     */
    public Color3f color;

    /**
     * Reflectivity of the material
     */
    public double albedo;

    public boolean isReflective;

    /**
     * Create a material
     * 
     * @param color  Material color
     * @param albedo Material reflectivity
     * @param isReflective Is the material reflective?
     */
    public Material(Color3f color, double albedo, boolean isReflective) {
        this.color = color;
        this.albedo = albedo;
        this.isReflective = isReflective;
    }

    /**
     * Create a material
     * 
     * @param color  Material color
     * @param albedo Material reflectivity
     */
    public Material(Color3f color, double albedo) {
        this(color, albedo, false);
    }

}