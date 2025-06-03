.class public final synthetic Lu9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu9/c;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lu9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9/b;->a:Lu9/c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu9/b;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu9/b;->a:Lu9/c;

    iget-boolean v1, p0, Lu9/b;->b:Z

    invoke-virtual {v0, v1}, Lu9/c;->b(Z)V

    return-void
.end method
