.class public Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FlutterMutator"
.end annotation


# instance fields
.field private matrix:Landroid/graphics/Matrix;

.field private path:Landroid/graphics/Path;

.field private radiis:[F

.field private rect:Landroid/graphics/Rect;

.field public final synthetic this$0:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;

.field private type:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;


# direct methods
.method public constructor <init>(Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;Landroid/graphics/Matrix;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->this$0:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;->TRANSFORM:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    iput-object p1, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->type:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    iput-object p2, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->matrix:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;Landroid/graphics/Path;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->this$0:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;->CLIP_PATH:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    iput-object p1, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->type:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    iput-object p2, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->path:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->this$0:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;->CLIP_RECT:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    iput-object p1, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->type:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    iput-object p2, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->rect:Landroid/graphics/Rect;

    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;Landroid/graphics/Rect;[F)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->this$0:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;->CLIP_RRECT:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    iput-object p1, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->type:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    iput-object p2, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->rect:Landroid/graphics/Rect;

    iput-object p3, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->radiis:[F

    return-void
.end method


# virtual methods
.method public getMatrix()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->matrix:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public getPath()Landroid/graphics/Path;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->path:Landroid/graphics/Path;

    return-object v0
.end method

.method public getRect()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->rect:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getType()Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;
    .locals 1

    iget-object v0, p0, Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutator;->type:Lio/flutter/embedding/engine/mutatorsstack/FlutterMutatorsStack$FlutterMutatorType;

    return-object v0
.end method
