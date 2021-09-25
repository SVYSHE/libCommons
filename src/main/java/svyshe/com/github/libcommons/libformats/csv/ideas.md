# Ideas for libCSV

> René Panke, 25.09.2020

## `CSVConverter`

To convert from CSV to and vice versa

- `.xlsx` Excel-Sheet
- Word table
- Database table
- Markdown table
- LaTeX table
- `CommaSeparatedValue` and `CommaSeparatedValues`

## `CSVParser`

To:

- validate CSV files
- *TODO: Make the parser accept different RFCs as enum*

### ABNF Grammar

- `Textdata`: ASCII(32,33,35-43,45-126)
- `CR`: ASCII(13)
- `LF`: ASCII(10)
- `Comma`: ASCII(44)
- `DQuote`: ASCII(34)
- `NonEscaped`: n*`Textdata`
- `Escaped`: `DQuote` n*(`Textdata`, `Comma`, `CR`, `LF`, 2*`DQuote`) `DQuote`
- `Field`: `Escaped` `NonEscaped`
- `Name`: `Field`
- `Record`: `Field` n* (`Comma` `Field`)
- `Header`: `Name` n*(`Comma` `Name`)
- `File`: [`Header` `CRLF`] `Record` n*(`CLRF` `Record`) [`CRLF`]
## `CommaSeparatedValue` and `CommaSeperatedValues`

Make `CommaSeparatedValue` represent a single line and `CommaSeperatedValues` representing a whole CSV-file. 