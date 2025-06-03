.class public final synthetic Lo4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:Lo4/b;

.field public final synthetic b:Lo4/j$c;


# direct methods
.method public synthetic constructor <init>(Lo4/b;Lo4/j$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/a;->a:Lo4/b;

    iput-object p2, p0, Lo4/a;->b:Lo4/j$c;

    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 0

    iget-object p1, p0, Lo4/a;->a:Lo4/b;

    iget-object p4, p0, Lo4/a;->b:Lo4/j$c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p4, Lw5/g$c;

    invoke-virtual {p4, p2, p3}, Lw5/g$c;->b(J)V

    return-void
.end method
