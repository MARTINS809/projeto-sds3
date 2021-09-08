import Barchart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NaviBar from "components/NaviBar";
function App() {
  return (
    <>
      <NaviBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de Vendas</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Taxa de sucesso(%)</h5>
            <Barchart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Todas as Vendas</h5>
            <DonutChart/>
          </div>
          <div className= "py-3">
            <h2 className="text-primary">Todas as Vendas</h2>
          </div>
        
        
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
