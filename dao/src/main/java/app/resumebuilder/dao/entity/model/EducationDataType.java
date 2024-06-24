package app.resumebuilder.dao.entity.model;

import jakarta.persistence.*;
import lombok.Data;



/**
 * education_data_type table
 */

@Data
@Entity
@Table(name = "education_data_type")
public class EducationDataType {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "position")
    private String position;

    @Column(name = "from_year")
    private String fromYear;

    @Column(name = "to_year")
    private String toYear;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "i_temporary_cv_data_slice_props_id")
    private ITemporaryCvDataSliceProps iTemporaryCvDataSliceProps;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationDataType that = (EducationDataType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + id;
        return hashCode;
    }
}