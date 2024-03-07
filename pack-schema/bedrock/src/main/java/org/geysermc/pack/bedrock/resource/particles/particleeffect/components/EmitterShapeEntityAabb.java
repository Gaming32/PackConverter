package org.geysermc.pack.bedrock.resource.particles.particleeffect.components;

import java.lang.String;

/**
 * Emitter Shape Entity Aabb Component For 1.10.0
 */
public class EmitterShapeEntityAabb {
  public String[] direction;

  public String[] offset;

  /**
   * @return Direction
   */
  public String[] direction() {
    return this.direction;
  }

  /**
   * @param direction Direction
   */
  public void direction(String[] direction) {
    this.direction = direction;
  }

  /**
   * @return Offset
   */
  public String[] offset() {
    return this.offset;
  }

  /**
   * @param offset Offset
   */
  public void offset(String[] offset) {
    this.offset = offset;
  }
}