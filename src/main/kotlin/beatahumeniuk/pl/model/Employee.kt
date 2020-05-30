package beatahumeniuk.pl.model

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity
import javax.persistence.OneToOne

@Entity
data class Employee (
        private var name: String,
        private var surname: String,
        private var email: String,

        @OneToOne
        private var position: Position
) : PanacheEntity()


@Entity
data class Position (
        private var positionName: String,

        @OneToOne
        private var employee: Employee
) : PanacheEntity()
