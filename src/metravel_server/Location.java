package metravel_server;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "t_location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "fbid", length = 40)
    private String fbid;

    @Column(name = "name", length = 40)
    private String name;

    @Column(name = "address", length = 500)
    private String address;

    @Column(name = "category", length = 100)
    private String category;

    @Column(name = "comment", length = 500)
    private String comment;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longtitude")
    private double longtitude;

    public Location(String fbid, String name, String address, String comment, double latitude, double longtitude) {
        this.fbid = fbid;
        this.name = name;
        this.address = address;
        this.comment = comment;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }
}
