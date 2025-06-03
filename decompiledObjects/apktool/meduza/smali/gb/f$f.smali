.class public final Lgb/f$f;
.super Lgb/f$g;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final d:Ljava/io/Closeable;


# direct methods
.method public constructor <init>(Lgb/f;Lgb/f$b;Lgb/f$c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lgb/f$g;-><init>(Lgb/f;Ljava/lang/Runnable;)V

    iput-object p3, p0, Lgb/f$f;->d:Ljava/io/Closeable;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lgb/f$f;->d:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method
