.class public final Lo0/f;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lwb/c;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "androidx.datastore.core.DataMigrationInitializer$Companion"
    f = "DataMigrationInitializer.kt"
    l = {
        0x2a,
        0x39
    }
    m = "runMigrations"
.end annotation


# instance fields
.field public a:Ljava/io/Serializable;

.field public b:Ljava/util/Iterator;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lo0/h$a;

.field public e:I


# direct methods
.method public constructor <init>(Lo0/h$a;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/h$a;",
            "Lub/e<",
            "-",
            "Lo0/f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/f;->d:Lo0/h$a;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo0/f;->c:Ljava/lang/Object;

    iget p1, p0, Lo0/f;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo0/f;->e:I

    iget-object p1, p0, Lo0/f;->d:Lo0/h$a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lo0/h$a;->a(Lo0/h$a;Ljava/util/List;Lo0/k;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
