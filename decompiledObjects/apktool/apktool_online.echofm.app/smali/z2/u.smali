.class public final Lz2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:I

.field public final synthetic p:Lz2/x;


# direct methods
.method public constructor <init>(Lz2/x;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/u;->p:Lz2/x;

    .line 2
    .line 3
    iput p2, p0, Lz2/u;->o:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/u;->p:Lz2/x;

    .line 2
    .line 3
    iget v1, p0, Lz2/u;->o:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz2/x;->z(Lz2/x;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
