.class public final synthetic Lw3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/l$a;


# instance fields
.field public final synthetic a:Lw3/b$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lw3/b$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/o;->a:Lw3/b$a;

    iput p2, p0, Lw3/o;->b:I

    iput-wide p3, p0, Lw3/o;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lw3/o;->a:Lw3/b$a;

    iget v1, p0, Lw3/o;->b:I

    iget-wide v2, p0, Lw3/o;->c:J

    check-cast p1, Lw3/b;

    invoke-interface {p1, v0, v1, v2, v3}, Lw3/b;->P(Lw3/b$a;IJ)V

    return-void
.end method
