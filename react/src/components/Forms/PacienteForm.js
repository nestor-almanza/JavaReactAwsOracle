import React, {Fragment, useState} from 'react';
import '../styles/PacienteForm.css';


export const PacienteForm = () => {

    const [datos, setDatos] = useState({
        nss: '',
        nombre: '',
        apellido:'',
        numTelefonico:'',
        area:''
    })

    const handleInputChance = ( event ) =>{
        //console.log(event.target.value);
        setDatos({
            ...datos,
            [event.target.name]: event.target.value
        })
    }

    const enviarDatos = ( event ) => {
        event.preventDefault();//evitamos el procesamiento automatico de datos
        console.log( JSON.stringify(datos));
    }

    return (
        <Fragment>
            <div className="container center">
                
                <form className="row" onSubmit={ enviarDatos }>

                    <div className="col-md-12">
                        <label className="form-label" > Numero de seguridad social </label>
                        <input 
                            placeholder="Input nss"
                            className="form-control"
                            type="text"
                            name="nss"
                            onChange={ handleInputChance }
                            
                        />
                    </div>

                    <div className="container mt-5 col-md-6">
                        <label className="form-label" > Nombre completo</label>
                        <input 
                            placeholder="Input name"
                            className="form-control"
                            type="text"
                            name="nombre"
                            onChange={ handleInputChance }
                            
                        />
                    </div>
                            
                    <div className="container mt-5 col-md-6" >
                        <label className="form-label" > Apellidos</label>
                        <input 
                            placeholder="Input lastname"
                            className="form-control"
                            type="text"
                            name="apellido"
                            onChange={ handleInputChance }
                        />
                    </div>

                    <div className="container mt-5 col-md-6">
                        <label className="form-label" >Numero Telefonico</label>
                        <input 
                            placeholder="Input phone number"
                            className="form-control"
                            type="tel"
                            name="numTelefonico"
                            onChange={ handleInputChance }
                            
                        />
                    </div>
                            
                    <div className="container mt-5 col-md-6" >
                        <label className="form-label" >Area</label>
                        <input 
                            placeholder="Input medical area"
                            className="form-control"
                            type="text"
                            name="area"
                            onChange={ handleInputChance }
                        />
                    </div>

                    <div className="container mt-5">
                        <button
                            className="btn btn-secondary width:50%"
                            type="submit"
                        > Enviar </button>
                    </div>
                    
                </form>

            </div> 
        </Fragment>
    )
}