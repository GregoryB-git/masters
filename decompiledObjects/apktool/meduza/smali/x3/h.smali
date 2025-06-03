.class public final synthetic Lx3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx3/l$a;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lx3/l$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/h;->a:Lx3/l$a;

    iput-wide p2, p0, Lx3/h;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lx3/h;->a:Lx3/l$a;

    iget-wide v1, p0, Lx3/h;->b:J

    iget-object v0, v0, Lx3/l$a;->b:Lx3/l;

    sget v3, Lv5/e0;->a:I

    invoke-interface {v0, v1, v2}, Lx3/l;->s(J)V

    return-void
.end method
