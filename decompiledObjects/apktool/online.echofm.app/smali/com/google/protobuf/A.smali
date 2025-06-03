.class public abstract Lcom/google/protobuf/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/A$c;,
        Lcom/google/protobuf/A$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/protobuf/A;

.field public static final b:Lcom/google/protobuf/A;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/protobuf/A$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/protobuf/A$b;-><init>(Lcom/google/protobuf/A$a;)V

    sput-object v0, Lcom/google/protobuf/A;->a:Lcom/google/protobuf/A;

    new-instance v0, Lcom/google/protobuf/A$c;

    invoke-direct {v0, v1}, Lcom/google/protobuf/A$c;-><init>(Lcom/google/protobuf/A$a;)V

    sput-object v0, Lcom/google/protobuf/A;->b:Lcom/google/protobuf/A;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/A$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/protobuf/A;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/protobuf/A;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/A;->a:Lcom/google/protobuf/A;

    return-object v0
.end method

.method public static b()Lcom/google/protobuf/A;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/A;->b:Lcom/google/protobuf/A;

    return-object v0
.end method


# virtual methods
.method public abstract c(Ljava/lang/Object;J)V
.end method

.method public abstract d(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
