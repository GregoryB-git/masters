.class public final Lo0/z;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation runtime Lwb/e;
    c = "androidx.datastore.core.SingleProcessDataStore"
    f = "SingleProcessDataStore.kt"
    l = {
        0x192,
        0x19a
    }
    m = "transformAndWrite"
.end annotation


# instance fields
.field public a:Lo0/q;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lo0/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/q<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public f:I


# direct methods
.method public constructor <init>(Lo0/q;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/q<",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-",
            "Lo0/z;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/z;->e:Lo0/q;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo0/z;->d:Ljava/lang/Object;

    iget p1, p0, Lo0/z;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo0/z;->f:I

    iget-object p1, p0, Lo0/z;->e:Lo0/q;

    sget-object v0, Lo0/q;->k:Ljava/util/LinkedHashSet;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0, v0}, Lo0/q;->i(Lub/e;Lub/h;Ldc/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
