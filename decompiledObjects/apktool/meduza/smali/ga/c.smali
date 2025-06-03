.class public final Lga/c;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/a<",
        "Lga/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lo0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/i<",
            "Lr0/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo0/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/i<",
            "Lr0/d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lga/c;->a:Lo0/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lga/i;

    iget-object v1, p0, Lga/c;->a:Lo0/i;

    invoke-direct {v0, v1}, Lga/i;-><init>(Lo0/i;)V

    return-object v0
.end method
