package beatahumeniuk.pl.dto

data class Employee (
        private var id: Long,
        private var name: String,
        private var surname: String,
        private var email: String,
        private var position: Position

)

data class Position(
        private var id: Long,
        private var positionName: String
)