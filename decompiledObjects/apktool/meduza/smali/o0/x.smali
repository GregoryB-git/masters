.class public final Lo0/x;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation runtime Lwb/e;
    c = "androidx.datastore.core.SingleProcessDataStore"
    f = "SingleProcessDataStore.kt"
    l = {
        0x114,
        0x119,
        0x11c
    }
    m = "handleUpdate"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lo0/q;

.field public c:Lnc/r;

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
            "Lo0/x;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/x;->e:Lo0/q;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo0/x;->d:Ljava/lang/Object;

    iget p1, p0, Lo0/x;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo0/x;->f:I

    iget-object p1, p0, Lo0/x;->e:Lo0/q;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lo0/q;->b(Lo0/q;Lo0/q$a$b;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
