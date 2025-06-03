.class public final Lpc/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnc/i2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnc/i2;"
    }
.end annotation


# instance fields
.field public final a:Lnc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/l<",
            "Lpc/j<",
            "+TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnc/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnc/l<",
            "-",
            "Lpc/j<",
            "+TE;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/r;->a:Lnc/l;

    return-void
.end method


# virtual methods
.method public final c(Lsc/t;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsc/t<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lpc/r;->a:Lnc/l;

    invoke-virtual {v0, p1, p2}, Lnc/l;->c(Lsc/t;I)V

    return-void
.end method
