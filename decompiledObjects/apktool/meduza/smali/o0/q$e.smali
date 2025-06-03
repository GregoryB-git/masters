.class public final Lo0/q$e;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo0/q;->e(Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "androidx.datastore.core.SingleProcessDataStore"
    f = "SingleProcessDataStore.kt"
    l = {
        0x12e
    }
    m = "readAndInitOrPropagateAndThrowFailure"
.end annotation


# instance fields
.field public a:Lo0/q;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lo0/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/q<",
            "TT;>;"
        }
    .end annotation
.end field

.field public d:I


# direct methods
.method public constructor <init>(Lo0/q;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/q<",
            "TT;>;",
            "Lub/e<",
            "-",
            "Lo0/q$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/q$e;->c:Lo0/q;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo0/q$e;->b:Ljava/lang/Object;

    iget p1, p0, Lo0/q$e;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo0/q$e;->d:I

    iget-object p1, p0, Lo0/q$e;->c:Lo0/q;

    sget-object v0, Lo0/q;->k:Ljava/util/LinkedHashSet;

    invoke-virtual {p1, p0}, Lo0/q;->e(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
