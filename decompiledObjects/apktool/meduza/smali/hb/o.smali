.class public final Lhb/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/s3;


# instance fields
.field public final a:Lxc/f;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(Lxc/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/o;->a:Lxc/f;

    iput p2, p0, Lhb/o;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lhb/o;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lhb/o;->c:I

    return v0
.end method

.method public final c(B)V
    .locals 1

    iget-object v0, p0, Lhb/o;->a:Lxc/f;

    invoke-virtual {v0, p1}, Lxc/f;->B0(I)V

    iget p1, p0, Lhb/o;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lhb/o;->b:I

    iget p1, p0, Lhb/o;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lhb/o;->c:I

    return-void
.end method

.method public final release()V
    .locals 0

    return-void
.end method

.method public final write([BII)V
    .locals 1

    iget-object v0, p0, Lhb/o;->a:Lxc/f;

    invoke-virtual {v0, p1, p2, p3}, Lxc/f;->write([BII)V

    iget p1, p0, Lhb/o;->b:I

    sub-int/2addr p1, p3

    iput p1, p0, Lhb/o;->b:I

    iget p1, p0, Lhb/o;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Lhb/o;->c:I

    return-void
.end method
