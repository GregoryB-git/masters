.class public final Laa/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lu/q;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lu/q;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/e$a;->a:Lu/q;

    iput-object p2, p0, Laa/e$a;->b:Ljava/lang/String;

    return-void
.end method
