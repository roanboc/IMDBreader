/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.edu.imdbreader;

/**
 *
 * @author Rodrigo B
 */
public class Personaje {
    
    private int id;
    private String realName;
    private String birthDate;
    private String deathDate;
    private String nickname;

    public Personaje(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    /**
     * Get the value of nickname
     *
     * @return the value of nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Set the value of nickname
     *
     * @param nickname new value of nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Get the value of birthDate
     *
     * @return the value of birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Set the value of birthDate
     *
     * @param birthDate new value of birthDate
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Get the value of deathDate
     *
     * @return the value of deathDate
     */
    public String getDeathDate() {
        return deathDate;
    }

    /**
     * Set the value of deathDate
     *
     * @param deathDate new value of deathDate
     */
    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }
    
    /**
     * Get the value of realName
     *
     * @return the value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Set the value of realName
     *
     * @param realName new value of realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return id + ";" + realName + ";" + nickname + ";" + birthDate + ";" + deathDate;
    }

    
}
