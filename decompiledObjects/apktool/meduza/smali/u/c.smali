.class public final Lu/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lu/f$a;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu/f$a;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lu/c;->a:Lu/f$a;

    iput-object p2, p0, Lu/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu/c;->a:Lu/f$a;

    iget-object v1, p0, Lu/c;->b:Ljava/lang/Object;

    iput-object v1, v0, Lu/f$a;->a:Ljava/lang/Object;

    return-void
.end method
