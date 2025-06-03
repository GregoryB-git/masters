.class public final Lm6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final b:Lm6/d;

.field public static final c:Lm6/f;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm6/d;

    const-string v1, "LibraryVersion"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lm6/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lm6/f;->b:Lm6/d;

    new-instance v0, Lm6/f;

    invoke-direct {v0}, Lm6/f;-><init>()V

    sput-object v0, Lm6/f;->c:Lm6/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lm6/f;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method
