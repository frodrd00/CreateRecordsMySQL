package cre.unileon;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;

public class InsertData {
	
	final static Logger logger = Logger.getLogger(InsertData.class);
	Connection connection = null;
	
	
	public InsertData(Connection connection) {
		super();
		this.connection = connection;
	}


	public void insertarUsuarios(){
		
		String insert = "";
		
		
		for(int i=0;i<1000;i++){
			
			insert = "INSERT INTO usuarios (expediente, apellido2, apellido1, nombre, sexo, estadoCivil, DNI, segSocial, fechaNacimiento, edad, localidadNacimiento, provinciaNacimiento, domicilio, telefono, movil, localidad, CP, provincia, nacionalidad, patologia, tipoPlaza, rApellido1, rApellido2, rNombre, rDNI, rRelacion, rDomicilio, rTelefono, rMovil, rLocalidad, rCP, rProvincia, apto, meses, fechaIngreso, alta, motivoAlta, fechaAlta, lateralidad, escolaridad, ocupacionPrevia, numeroHabitacion, alergias, dietas, historiaClinica, numeroCuenta, imagen, composicionFamiliar, relacionesFamiliares, otrasSituaciones, situacionSanitaria, situacionPersonal, situacionEconomica, valoracionTrabajoSocial, nombreUsuario, color, planta, antecedentes, estado, eliminar, objetivosAnimacion, intervencionAnimacion, fechaPIA, objetivosDeporte, intervencionDeporte, objetivosEducacion, intervencionEducacion, objetivosEnfermeria, intervencionEnfermeria, objetivosFisioterapia, intervencionFisioterapia, objetivosLogopedia, intervencionLogopedia, objetivosMedicina, intervencionMedicina, objetivosPsicologia, intervencionPsicologia, objetivosReferencia, intervencionReferencia, objetivosTerapia, intervencionTerapia, objetivosTrabajo, intervencionTrabajo, historiaClinicaPsicologia, historiaClinicaNeuro, historiaClinicaMedicina, historiaClinicaLogopedia, antecedentesFamiliares, antecedentesQuirurgicos, antecedentesMedicos, grupoDiscapacidad, grupoDiscapacidadTexto, pais, comunidadAutonoma, tratamientos, tramoEdad, fechaResolucion, reunionUsuarios, fechaSiguientePIA, nivelEstudios, tipoPrestacion, solicitudDependencia, reconocimientoDependencia, gradoDependencia, recibeDependencia, certificadoMinusvalia, dias, fechaAnteriorPIA, fechaAltaComunicacion, altaComunicacion, diasAlta, fechaPIADependencia, profesionalReferencia, fechaAsignacion, diasReferencia, numeroConsulta, resultadosDeporte, resultadosEducacion, resultadosEnfermeria, resultadosFisioterapia, resultadosLogopedia, resultadosMedicina, resultadosPsicologia, resultadosReferencia, resultadosTerapia, resultadosTrabajo, email, objetivosNeuropsicologia, intervencionNeuropsicologia, resultadosNeuropsicologia, rEmail, rPais, ingresado, colorIngresado, DNIProfesionalPIA, nombreProfesionalPIA, diasPIA, numeroDias, tDNI, tApellido1, tApellido2, tNombre, tRelacion, tDomicilio, tLocalidad, tProvincia, tPais, tCP, tTelefono, tMovil, tEmail, firmado, nombreFirmado, uBanoProducto, uBanoFrecuencia, uFrecuenciaBano, uLavadoCabezaProducto, uLavadoCabezaFrecuencia, uCuidadoPielProducto, uCuidadoPielFrecuencia, uDependenciaHigiene, uSupervisionHigieneS, uSupervisionHigieneN, C01S, C01N, uUPPS, uUPPN, C02S, C02N, uUPP, uInsomnioS, uINsomnioN, C03S, C03N, uTomaTratamientoS, uTomaTratamientoN, C04S, C04N, uAlmohadillado, uBarandillasS, uBarandillasN, C05S, C05N, uAlmohadilladoBarandillaS, uAlmohadilladoBarandillaN, C06S, C06N, uSujecionesS, uSujecionesN, C07S, C07N, uLiquidos, uIncontinenciaS, uIncontinenciaN, C08S, C08N, uPortadorS, uPortadorN, C09S, C09N, uColectorS, uColectorN, C10S, C10N, uColector, uTipoSonda, uCalibre, uSondajesS, uSondajesN, C11S, C11N, uAbsorbenteDia, uAbsorbenteNoche, uFecalS, uFecalN, C12S, C12N, uDiarreaS, uDiarreaN, C13S, C13N, uEstrenimientoS, uEstrenimientoN, C14S, C14N, uPautasOrales, uPautasEnemas, uPautasSupositorios, uAntecedentesAnal, uIncontinencia, uColoracion, uColoracionTexto, uMucosas, uMucosasTexto, uFR, uSATO2, uOxigenoterapiaS, uOxigenoterapiaN, C15S, C15N, uOxigenoterapiaLitros, uOxigenoterapiaFrecuencia, uAntecedentesRespirar, uViaAdministracionDieta, uEspesanteS, uEspesanteN, C16S, C16N, uEspesanteConsistencia, uPeso, uTalla, uIMC, uPortador, uPortadorTexto, uIntolerancias, uProtesisS, uProtesisN, C17S, C17N, uIndependienteComidaS, uIndependienteComidaN, C18S, C18N, uProtocoloAlimentacionLogopediaS, uProtocoloAlimentacionLogopediaN, C19S, C19N, uLiquidosCantidad, uLiquidosFrecuencia, uGelatinasCantidad, uGelatinasFrecuencia, uBatidosS, uBatidosN, uBatidosProducto, uFrecuencia1, uFrecuencia2, uFrecuencia3, uFrecuencia4, uFrecuencia5, uFrecuencia6, C20, C21, C22, C23, C24, C25, uFrecuencia1Lugar, uFrecuencia2Lugar, uFrecuencia3Lugar, uFrecuencia4Lugar, uFrecuencia5Lugar, uFrecuencia6Lugar, uFrecuencia1Cantidad, uFrecuencia2Cantidad, uFrecuencia3Cantidad, uFrecuencia4Cantidad, uFrecuencia5Cantidad, uFrecuencia6Cantidad, C26S, C26N, uGafasS, uGafasN, C27S, C27N, uLentillasS, uLentillasN, C28S, C28N, uProtesisDentalS, uProtesisDentalN, C29S, C29N, uAudifonoS, uAudifonoN, C30S, C30N, uAlteracionesCognitivasS, uAlteracionesCognitivasN, C31S, C31N, uAlteracionesCognitivas, uSujeciones, escalaWaterlow, escalaBraden, escalaInteRAI, escalaNortonModificada, areaIntelectual, areaPersonalidad, imcUsuario, tFechaIncapacidad, fechaIngresoDesde, fechaIngresoHasta, historico) "
					+ "VALUES ('ASDF"+i+"', 'Tomcat"+i+"', 'Catalina"+i+"', 'Pepe"+i+"', 'hombre', 'casado','"+i+"8965J', 'aasdasd', '1980-07-05', 0, 'asdasd', 'asdd', 'asdasd', '123123', '123333', 'asdasd', '1237', 'aasd', 'asdddd', 'asdasdasd', 'aasddd', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'si', 0, '2016-07-03', 0, 'asddddd', '2016-07-15', 'iz', 'asdasd', 'asdasd', 12, 'asdasd', 'ddxzc', 'zxcqwe', '123123213', NULL, 'asdasdzx', 'cxcasd', 'asdasdqwe', 'qweqwesd', 'asdqweqwe', 'qweqwe qwe ', 'qwcasa d as', 'emil', 'blanco', 1, 'asdasd', 'ddddasd', 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', '', 'españa', 'madrid', 'asdas ', 'dasda', '2016-07-21', 'asdasdasdd', '2016-07-14', 'eeqwee', 'qweqw ewq ', 'si', 'si', 'qwe', 'si', 'si', 123, '2016-07-19 00:00:00', '2016-07-14', 'qweqwe', 12, '2016-07-12', 'asdasdas ', '2016-07-14', 12, 3, NULL, NULL, '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'asdasd@gmail.com', 'qweqwe', 'ee qw qw ', 'qwe qw eqwe ', NULL, NULL, 1, 'rojo', '', NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, NULL, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, 0, 0, 0, 0, 0, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, 0, 0, NULL, NULL, NULL, NULL, 0, 0, 0, 0, NULL, NULL, NULL, NULL, NULL, NULL, 0)";
			
			try {
			
				Statement stmt = connection.createStatement();
				stmt.executeUpdate(insert);
				logger.info("Usuario numero " + i +" insertado.");
				stmt.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				logger.info(e);
			}
			
			
		}
	}
	
	
	public void insertarProfesionales(){
		
		String insert = "";
		
		
		for(int i=0;i<1000;i++){
			
			insert = "INSERT INTO profesionales (DNI, apellido1, apellido2, nombre, area, numeroColegiado, login, password, imagen, fontFace, fontSize, areaMedicinaL, areaMedicinaE, areaEnfermeriaL, areaEnfermeriaE, areaFisioterapiaL, areaFisioterapiaE, areaTerapiaL, areaTerapiaE, areaPsicologiaL, areaPsicologiaE, areaTrabajoL, areaTrabajoE, areaEducacionL, areaEducacionE, areaLogopediaL, areaLogopediaE, areaAdministracionL, areaAdministracionE, areaAuxEnfermeriaL, areaAuxEnfermeriaE, areaAnimacionL, areaAnimacionE, email, areaNeuropsicologiaL, areaNeuropsicologiaE, nombreProfesional, areaDeporteE, areaDeporteL, areaReferenciaE, areaReferenciaL, codigo, areaRecepcionE, areaRecepcionL, bloqueado, fechaCambioPassword, inactividad, esInvestigador, nacimiento, titulacion, grado, telefono, accesoHistorico, historico, organismo, centroOrganismo, direccionO, localidadO, CPO) "
					+ "VALUES ('"+i+"58938L', 'Fernandez', 'Diaz', 'Calendula', 'ddsdfs', '123213', 'pepe00', 'pepe00', NULL, 'Times New Roman', 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 'pepe@gmail.com', 0, 0, NULL, 0, 0, 0, 0, '123dada', 0, 0, 0, '2016-07-06', 15, 1, '1990-07-06', 'asdasdas dasdasda', 'xcsadas ', '568966325', 0, 0, 'asdas as as', 'asdsa das ', 'asddd asdasd', 'asddasd asd ', '32569')";;
			
			try {
			
				Statement stmt = connection.createStatement();
				stmt.executeUpdate(insert);
				logger.info("Profesional numero " + i +" insertado.");
				stmt.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				logger.info(e);
			}
			
			
		}
	}
	
	public void insertarSolicitudes(){
		
		String insert = "";
		
		
		for(int i=0;i<1000;i++){
			
			insert = "INSERT INTO solicitudes VALUES ("+i+",NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1992-12-07',NULL,NULL,NULL,NULL,NULL,NULL,NULL,2,0,'77476235',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,0,0,0,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2000-05-12',NULL,NULL,NULL,NULL,NULL,NULL,'asd@gmail.com',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0)";
			
			try {
			
				Statement stmt = connection.createStatement();
				stmt.executeUpdate(insert);
				logger.info("Solicitud numero " + i +" insertado.");
				stmt.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				logger.info(e);
			}
			
			
		}
	}

}
