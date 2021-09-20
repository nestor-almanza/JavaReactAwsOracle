import React , {useEffect, useState} from 'react';
import { EspecialidadService } from '../../services/EspecialidadService';

export const Especialidad = () => {
    const [especialidades, setEspecialidad] = useState([]);

    useEffect(() => {
        getEspecialidad();
    }, [])

    const getEspecialidad = async () => {
        const resp = await EspecialidadService.get('http://localhost:8080/hospital/v1/getEspecialidades');
        setEspecialidad( resp.data )
    }

    

    return (
        <div> 
            <h1 className="text-center" > Lista de Especialidades</h1>
            <table className="table table-striped">
        <thead>
                <tr>
                            
                    <td> Id</td>
                    <td> Especialidad</td>
                            
                </tr>
            </thead>
            <tbody>
                {
                    especialidades.map( especialidad => (

                        <tr key={ especialidad.idEspecialidad }>
                            <td> { especialidad.idEspecialidad} </td>
                            <td> { especialidad.nombre } </td>
                            
                            <button>eliminar</button>
                            <button>actualizar</button>
                        </tr>
                    ))
                }         
            </tbody>
            <button>agregar</button>
            </table>
        </div>
    )

    
    
}